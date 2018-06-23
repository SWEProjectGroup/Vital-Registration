import socket as sk
from argparse import ArgumentParser


parser = ArgumentParser()
parser.add_argument("-ip",default="127.0.0.1",help="What is the ip address")
parser.add_argument("-port",type = int,default=4444,help="What is the port ? ")
args = parser.parse_args()
    
serverIP = args.ip
serverPort = args.port
bufferSize = 1024

while True:
    message = input("Please enter the statement:")
    clientSocket = sk.socket(sk.AF_INET, sk.SOCK_DGRAM)
    clientSocket.sendto(message.encode('ascii'), (serverIP, serverPort))
    recvMessage, serverAddress = clientSocket.recvfrom(bufferSize)
    print ("Return text from the server:", recvMessage.decode("utf-8"), "\n")
    clientSocket.close()
