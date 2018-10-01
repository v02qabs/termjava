cd ./src
ecj sqlite3/Main.java -cp ../lib/*.jar

cd ../

cd ./bin

dx --dex --output=../dist/Main.jar sqlite3/Main.class ../lib/*.jar
