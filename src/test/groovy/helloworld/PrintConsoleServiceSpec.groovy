package helloworld

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class PrintConsoleServiceSpec extends Specification implements ServiceUnitTest<PrintConsoleService>{
    static data = "Hello World"

    def setup() {
    }

    def cleanup() {
    }

    void "print to Console"() {
        when: "print to Console is called"
            String result = service.printData(data)

        then: "result == 'Hello World'"
            result.contentEquals("Hello World")
    }
}
