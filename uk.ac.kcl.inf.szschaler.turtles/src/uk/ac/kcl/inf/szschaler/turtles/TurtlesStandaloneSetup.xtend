/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.turtles


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TurtlesStandaloneSetup extends TurtlesStandaloneSetupGenerated {

	def static void doSetup() {
		new TurtlesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
