package uk.ac.kcl.inf.szschaler.turtles.generator

import java.net.URI
import java.net.URISyntaxException
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.epsilon.common.util.StringProperties
import org.eclipse.epsilon.emc.emf.EmfModel
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException
import org.eclipse.epsilon.eol.models.IModel
import org.eclipse.epsilon.eol.models.IRelativePathResolver
import org.eclipse.epsilon.etl.EtlModule

abstract class ETLRunner {

	protected def String getSource()

	protected def List<IModel> getModels() throws Exception

	def EObject execute() throws Exception {

		val module = new EtlModule

		module.parse(getSource.getFileURI)

		if (module.parseProblems.size > 0) {
			System.err.println("Parse errors occured...")
			module.parseProblems.forEach[System.err.println(it.toString())]

			return null
		}

		models.forEach[module.context.modelRepository.addModel(it)]

		module.execute

		val result = (module.context.modelRepository.getModelByName("Target") as EmfModel).resource.contents.head

		module.getContext().getModelRepository().dispose()

		result
	}

	protected def EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
		boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		val emfModel = new EmfModel

		val properties = new StringProperties
		properties.put(EmfModel.PROPERTY_NAME, name)
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metamodel.getFileURI.toString)
		properties.put(EmfModel.PROPERTY_MODEL_URI, model.getFileURI.toString)
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "")
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "")

		emfModel.load(properties, null as IRelativePathResolver)

		emfModel
	}

	protected def EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
		boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		val emfModel = new EmfModel

		val properties = new StringProperties
		properties.put(EmfModel.PROPERTY_NAME, name)
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel)
		properties.put(EmfModel.PROPERTY_MODEL_URI, model.getFileURI.toString)
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "")
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "")

		emfModel.load(properties, null as IRelativePathResolver)

		emfModel
	}

	protected def EmfModel createInMemoryEmfModel(Resource r, String name, String metamodel,
		boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		val emfModel = new InMemoryEmfModel(r)

		val properties = new StringProperties
		properties.put(EmfModel.PROPERTY_NAME, name)
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel)
		properties.put(EmfModel.PROPERTY_READONLOAD, "false")
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "")

		emfModel.load(properties, null as IRelativePathResolver)

		emfModel
	}

	protected def URI getFileURI(String fileName) throws URISyntaxException {

		val binUri = ETLRunner.getResource(fileName).toURI
		var URI uri = null

		if (binUri.toString.indexOf("bin") > -1) {
			uri = new URI(binUri.toString.replaceAll("bin", "src"))
		} else {
			uri = binUri
		}

		return uri;
	}
}
