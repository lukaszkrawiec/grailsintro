package introapp3

class WelcomeController {

    def index() {
        def listItems = ["Thing1", "Thing1", "Thing1"]
        [items: listItems]
    }
}
