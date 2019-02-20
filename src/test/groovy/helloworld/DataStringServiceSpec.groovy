package helloworld

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class DataStringServiceSpec extends Specification implements ServiceUnitTest<DataStringService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test retrieveData"() {
        when: "retrieveData is called"
            String result = service.retrieveData()

        then: "result == 'Hello World'"
            result.contains("Hello World")
    }
}
