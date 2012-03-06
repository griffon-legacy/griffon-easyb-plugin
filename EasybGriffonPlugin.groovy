/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class EasybGriffonPlugin {
    // the plugin version
    String version = '0.6'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-easyb-plugin'

    List authors = [
            [
                    name: 'Andres Almiray',
                    email: 'aalmiray@yahoo.com'
            ]
    ]
    String title = 'Enables BDD testing with Easyb'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
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
'''
}
