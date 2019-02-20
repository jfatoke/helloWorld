package helloworld

import grails.gorm.transactions.Transactional

@Transactional
class DataStringService implements DataService <String> {

    String retrieveData() {
        return "Hello World"
    }
}
