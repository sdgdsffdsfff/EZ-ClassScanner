## Scan and find Class by annotation or name.

### How to use

Scan the specified class annotation in specified package:
`Set<Class<?>> resultInFile = ClassScanner.scan("com.ecfront.easybi.classscanner.test", Deprecated.class);`

Scan the specified class name in specified package:
`Set<Class<?>> resultInFile = ClassScanner.scan("org.junit", "Before\\w*")`

Scan the specified class annotation and name in specified package:
`Set<Class<?>> resultInFile = ClassScanner.scan("org.junit", "Before\\w*")`

### Building from source
The Project uses a [Maven][]-based build system.

### Check out sources
`git clone https://github.com/gudaoxuri/EZ-ClassScanner.git`

### License

Under version 2.0 of the [Apache License][].

[Apache License]: http://www.apache.org/licenses/LICENSE-2.0

[Maven]:http://maven.apache.org/
