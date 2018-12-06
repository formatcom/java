OUTPUT    := build
JFLAGS    := -d $(OUTPUT)
JAVAC     := javac

PACKAGES  := model controller view main
SRC_DIR   := $(addprefix src/,$(PACKAGES))

SRC       := $(foreach sdir,$(SRC_DIR),$(wildcard $(sdir)/*.java))
CLASS     := $(SRC:.java=.class)

all: output $(CLASS)

output:
	mkdir -p $(OUTPUT)

%.class: %.java
	$(JAVAC) $(JFLAGS) $<

clean:
	rm -rf $(OUTPUT)

