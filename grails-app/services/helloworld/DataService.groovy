package helloworld

import grails.gorm.transactions.Transactional

@Transactional
public interface DataService<T> {

    T retrieveData()
}
