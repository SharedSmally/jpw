JDK_HOME=${HOME}/TSDK/jdk-8u152

CXXFLAGS += -std=c++11
CXXFLAGS += -I${JDK_HOME}/include -I${JDK_HOME}/include/linux

all: run

helloWorld.class: helloWorld.java
  ${JDK_HOME}/bin/javac helloWorld.java

hello_world: hello_world.c
  gcc -o hello_world \
      -L ${JDK_HOME}/jre/lib/amd64/server/ \
      -ljvm \
      hello_world.c ${CXXFLAGS}

run: helloWorld.class hello_world
  export LD_LIBRARY_PATH=${JDK_HOME}/jre/lib/amd64/server/
  ./hello_world

clean:
  rm -f helloWorld.class hello_world
