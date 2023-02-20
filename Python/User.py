from Account import Account

class User(Account):
    def __init__(self, id,name,document,email,password):
        super().__init__(id,name,document,email,password)


user=User(1,"Ahmed","1234567890","escalona","123456")


