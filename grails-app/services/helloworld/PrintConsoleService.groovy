package helloworld

import grails.gorm.transactions.Transactional

@Transactional
class PrintConsoleService implements PrintService <String> {

    def printData(String data) {
        return data
    }
}
