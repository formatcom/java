JFLAGS = -d .
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = Point2D.java Hello.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) -r graphics *.class
