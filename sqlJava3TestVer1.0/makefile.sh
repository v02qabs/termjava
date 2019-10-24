	cd ./src
	ls	
	ecj -cp ../libs/sqlite.jar: *.java -d ../bin

	cd ../bin
	dx --dex --output=./debug/MainActivity.jar *.class

	cd ./debug
	dalvikvm -cp ../../libs/slqite.jar:MainActivity.jar: MainActivity


