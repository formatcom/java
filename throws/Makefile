JFLAGS = -d .
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

test1: test1.class

test2: test2.class

clean:
	$(RM) -r com *.txt
