JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
	mkdir -p bin
SRCDIR=src
BINDIR=bin
$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
CLASSES=Collator.class RandomGenerator.class Student.class TestStudent.class TestPRNG.class #add classes
CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)
default: $(CLASS_FILES)
clean:
	rm $(BINDIR)/*.class
run: $(CLASS_FILES)
# fix this run - java -cp bin TestHashTable
