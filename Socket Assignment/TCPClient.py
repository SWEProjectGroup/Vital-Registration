import socket as sk
from argparse import ArgumentParser

parser = ArgumentParser()
parser.add_argument("-ip",default="127.0.0.1",help="What is the ip address")
parser.add_argument("-port",type = int,default=5555,help="What is the port ? ")
args = parser.parse_args()
   
serverIP = args.ip
serverPort = args.port
bufferSize = 1024
    
while True:   
    message = input("Please enter the statement:")
    clientSocket = sk.socket(sk.AF_INET, sk.SOCK_STREAM)
    clientSocket.connect((serverIP, serverPort))
    clientSocket.send(message.encode('ascii'))
    recvMessage = clientSocket.recv(bufferSize)
    print ("Return text from the server:", recvMessage.decode('UTF-8'), "\n")
    clientSocket.close()
