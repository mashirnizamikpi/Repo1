package oops;

public abstract class Transport {

abstract int speed();

abstract String modelnumber();
 
abstract char regno();

abstract int Height();

abstract char Company();

abstract char type();

String name;

public String getName() {
	return name;
}
public void  setName(String name) {
	this.name =  name;
}

 } 