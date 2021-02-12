
// The scala command will execute a source script by wrapping it in a template and then compiling and executing the resulting program.
// In interactive mode, the REPL reads expressions at the prompt, wraps them in an executable template, and then compiles and executes 
// the result.

println("Hello, World")

// So running this file with :load will simply give us the greeting, but running this file in
// :paste mode will give the following error (error: expected class or object definition)

val b: Byte = 10 
val s: Short = b
val d: Double = s

// Scala does not allow automatic conversion from higher ranked types to lower ranked types. 

val l: Long = 20
val i: Int = l // will return type mismatch
val i: Int = l.toInt 

// Scala’s String is built on Java’s String and adds unique features like multiline literals and string interpolation.

val hello = "Hello There" 
val signature = "With Regards, \nYour friend" 

// Like numeric types, the String type supports the use of math operators. For example, use 
// the equals operator (==) to compare two String values. Unlike Java, the equals operator 
// (==) checks for true equality, not object reference equality. 

val greeting = "Hello, " + "World"
val matched = (greeting == "Hello, World")
val theme = "Na " * 16 + "Batman!"

// A more direct way to combine your values or variables inside a String is with string 
// interpolation, a special mode where external value and variable names are recognized and 
// resolved. 

val approx = 355/113f 
println("Pi, using 355/113, is about " + approx + "." )

// Here is the example again using string interpolation:

println(s"Pi, using 355/113, is about $approx." ) 



