
build : source-list
	javac -d build @source-list

source-list:
	find . -name "*.java" > source-list

clean:
	rm source-list
	rm -rf build/*

