# DreamArchetypes
This project is a collection of customized maven archetypes.

## Modules
### Java Project Archetype
* single-project-archetype: archetype for common java project
* parent-project-archetype: archetype for common java project included in a parent project
* child-project-archetype: archetype for child project(used with parent-project-archetype)
==================================================================================</br>
Above archetypes are used to generate initial java projects. In the generated java project, the following plugins are integrated:
* [junit4](http://junit.org/junit4): Java Test Framework
* [Findbugs](http://findbugs.sourceforge.net/): A program which uses static analysis to look for bugs in Java code
* [jacoco](http://www.eclemma.org/jacoco/trunk/doc/maven.html): A code coverage library for Java.

## Getting Started
This project is not deployed to any public maven repository yet. So if you want to try, you should checkout this repository at first.
###install archetypes
Goto the root of local cloned repository in shell and install this artifact into your local repository.
```
$ mvn install
```
### Generate initial project
```
$ mvn archetype:generate -DarchetypeGroupId=com.dream.maven.archetypes -DarchetypeArtifactId=[single-project-archetype/parent-project-archetype] -DarchetypeVersion=1.0 -DgroupId=[your.groupId] -DartifactId=[your.artifactId] -Dversion=[your.version] -DinteractiveMode=false
```
BTW: when generating project using child-project-archetype, you can add a additional parameter to specify parent artifact id by adding "-DparentArtifactId=[parent.archtype.id]"

### Project Management
Goto your project root directory in shell
```
$ mvn [package/install/deploy] site
```
Jacoco and findbugs data will be generated in deploy lifecycle, and the reports will be generated in site lifecycle.

## License

    Copyright 2018 Meng Jiang.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
