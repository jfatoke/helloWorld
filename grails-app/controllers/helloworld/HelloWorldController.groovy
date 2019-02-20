package helloworld

import grails.core.GrailsApplication
import helloworld.PrintDestination

class HelloWorldController {
    GrailsApplication grailsApplication
    def data, printDestination

    def helloWorld() {
        def dataService = new DataStringService()
        def printService

        data = dataService.retrieveData()

        // Default Print Destination is CONSOLE
        printDestination = grailsApplication.config.grails.printDestination

        switch(printDestination) {
            case PrintDestination.CONSOLE:
                printService = new PrintConsoleService()
                break
            case PrintDestination.WEB:
                printService = new PrintWebService()
                break
            case PrintDestination.MOBILE:
                //TODO: to be implemented with mobile css layout, etc.
                //go to default case now

            case PrintDestination.WINDOWS_SERVICES:
                //TODO: to be implemented
                //go to default case

            default:
                printService = new PrintConsoleService()
                break
        }

        // Just in case default to Print to Console
        if (!printService) {
            printService = new PrintConsoleService()
        }

        String output = printService.printData(data)

        [output: output, printDestination: printDestination]
    }

}
