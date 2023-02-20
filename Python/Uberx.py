
from car import Car
class Uberx(Car):
    brand=str
    model=str
    def __init__(self,brand,model,driver,passenger):
        super.__init__(driver,passenger)
        self.brand=brand
        self.model=model
        
