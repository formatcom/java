OUTPUT    := build
JFLAGS    := -d $(OUTPUT) -cp $(OUTPUT)
JAVAC     := javac

SRC       := Point2D.java Hello.java
CLASS     := $(SRC:.java=.class)

all: output $(CLASS)

output:
	mkdir -p $(OUTPUT)

%.class: %.java
	$(JAVAC) $(JFLAGS) $<

clean:
	rm -rf $(OUTPUT)

