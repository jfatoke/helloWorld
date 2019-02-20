package helloworld

import grails.gorm.transactions.Transactional

@Transactional
public interface PrintService<T> {

    def printData(T data)
}
