
build : source-list
	javac -d build @source-list

connect-4 : build
	java -cp build ConnectFour/Main

source-list:
	find . -name "*.java" > source-list

clean:
	rm source-list
	rm -rf build/*

