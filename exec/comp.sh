cd ./src
ecj *.java -d ../bin
cd ../bin
dx --dex --output=../dist/Main.jar *.class
