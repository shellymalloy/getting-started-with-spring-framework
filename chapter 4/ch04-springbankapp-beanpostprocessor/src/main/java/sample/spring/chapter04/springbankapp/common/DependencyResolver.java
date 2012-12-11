package sample.spring.chapter04.springbankapp.common;


public interface DependencyResolver {
	void resolveDependency(MyApplicationContext myApplicationContext);
}
