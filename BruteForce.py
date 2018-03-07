import hashlib

class BruteForce:


    extra_chars = "`!§$%&/()=?`."
    password_hash = "1e3bf495a62012e7caf5fdd25624605f"

    with open("C:\PythonStuff\PythonProjects\data\dictionary.txt", "r") as file:
        for line in file:
            word = line.strip()

            for char in extra_chars:
                hashword = word + char

                if hashlib.sha256(hashword.encode()).hexdigest() == password_hash:
                    print(word + char)

    print("BruteForceEnd")




