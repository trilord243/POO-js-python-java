class Account:
    id          = int
    name        =str
    document    =str
    email       =str
    password    =str
    
    def __init__(self, id, name, document, email, password):
        print(id, name, document, email, password)

