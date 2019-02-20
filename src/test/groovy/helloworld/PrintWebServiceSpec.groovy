package helloworld

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class PrintWebServiceSpec extends Specification implements ServiceUnitTest<PrintWebService>{

    def setup() {
    }

    def cleanup() {
    }

    void "print to Web"() {
        when: "print to Console is called"
            String result = service.printData(data)

        then: "result == '<h1>Hello World</h1>'"
            result.contentEquals("<h1>Hello World</h1>")
    }
}
