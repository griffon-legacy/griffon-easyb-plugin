
Enables BDD testing with Easyb
------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/easyb](http://artifacts.griffon-framework.org/plugin/easyb)


Brings Behavior Driven Development to your Griffon application via [Easyb][1]. This is a direct port of the 
[Grails Easyb plugin][2] made by Richard Vowles and Gustavo Madruga.

Usage
-----

The [Easyb][1] project has excellent documentation to get you started writing stories.

### Running Tests

Tests are run just like normal Griffon tests via grails `test-app`. A new _easyb_ test type is added to the unit,
integration and functional phases. You can use the Griffon 0.9 test type targeting feature to run only your Easyb tests…

        griffon test-app :easyb
	
Class names of Easyb tests must end in *Story*; otherwise the Griffon test runner won't find them. 

Scripts
-------

 * **create-unit-story** - creates a new Unit story. Mimics GriffonUnitTestCase
 * **create-integration-story** - creates a new Integration story. Mimics a regular JUnit integration test

[1]: http://easyb.org
[2]: http://grails.org/plugin/easyb

