from java:8
maintainer zbxhui@gmail.com
copy ./gittest/target/git-test-0.0.1-SNAPSHOT.jar ./docker.jar
cmd java -jar docker.jar
