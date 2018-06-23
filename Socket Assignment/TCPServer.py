import socket as sk
from argparse import ArgumentParser


parser = ArgumentParser()
parser.add_argument("-port",type=int,default=5555,help="What is the port number?")
args = parser.parse_args()
            
serverPort = args.port
bufferSize = 1024
serverSocket = sk.socket(sk.AF_INET, sk.SOCK_STREAM)
serverSocket.bind(('', serverPort))
serverSocket.listen(5)
print('Running')
while True:
    connectionSocket, addr = serverSocket.accept()
    message = connectionSocket.recv(bufferSize)
    print ("Message received:", message)
    connectionSocket.send(message.upper())
    connectionSocket.close()
    
