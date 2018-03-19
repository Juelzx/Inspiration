class OrGate():

    __author__ = "Julian Scholler"
    __version__= "1.0"

    def __init__(self, input0, input1):
        self.input0 = input0
        self.input1 = input1
        self.output = None
        self.name   = "LogicalOrGate"

    def execute(self):
        if self.input0 or self.input1:
            self.output = True
        else:
            self.output = False

    def show(self):
        returnVar = "input0:" + str(self.input0) + "\n" + "input1:" + str(self.input1) + "\n" + "output:" + str(self.output)
        print(returnVar)


OrGateObject = OrGate(False, True)
OrGateObject.execute()
OrGateObject.show()