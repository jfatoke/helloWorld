package helloworld

import grails.gorm.transactions.Transactional

@Transactional
class PrintWebService implements PrintService <String> {

    def printData(String data) {
        return "<h1>$data</h1>"
    }
}
