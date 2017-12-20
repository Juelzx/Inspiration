from decimal import Decimal
import locale



class AnnuityCalculator:

    locale.setlocale(locale.LC_ALL, "de-de")

    __author__ = "Julian Scholler"
    __version__ = "0.3"

    def __init__(self):
        self.__interestRate = Decimal(0.0) # private
        self.__interval = Decimal(0.0)  # private
        self.__loan = Decimal(0.0)  # private

    def __setInterestRate(self, newVal):
        self.__interestRate = newVal

    def __setInterval(self, newVal):
        self.__interval = newVal

    def __setLoan(self, newVal):
        self.__loan = newVal

    def getUserEntrys(self):

        print("Darlehensrechner")
        print("Author: " + self.__author__)
        print("Version: " + self.__version__ + "\n")



        try:
            inputLoan = Decimal(input("Bitte gebenn sie den Darlehensbetrag in EUR an."))
            inputInterval = Decimal(input("Bitte geben sie die Laufzeit an."))
            inputInterestRate = Decimal(input("Bitte geben sie den Zinssatz an."))

            self.__setLoan(inputLoan)
            self.__setInterval(inputInterval)
            self.__setInterestRate(inputInterestRate)

        except ValueError:
            print("Bitte korrekte Werte eingeben.")



    def calc(self):
        interest = self.__loan * self.__interval * self.__interestRate / Decimal(100)
        total = self.__loan + interest

        print("Die Zinsen des endfaelligen Darlehens betragen: {0:>12}".format(locale.currency(interest)))
        print("Die Gesamtfaelligkeit ist: {0:>12}".format(locale.currency(total)))


test = AnnuityCalculator()
test.getUserEntrys()
test.calc()

