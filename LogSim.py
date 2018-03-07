class AndGate():

    __author__ = "Julian Scholler"
    __version__= "1.0"


    def __init__(self, input0, input1):
        self.input0 = input0
        self.input1 = input1
        self.output = None
        self.name   = "LogicalAnd"


    def execute(self):
        if self.input0 and self.input1 == True:
            self.output = True
        else:
            self.output = False

    def show(self):
        varReturn = "Input0:" + str(self.input0) + "\n" + "Input1:" +  str(self.input1) + "\n" + "Output:" + str(self.output)
        return print(varReturn)


ObjectAndGate = AndGate(False, False)
ObjectAndGate.execute()
ObjectAndGate.show()