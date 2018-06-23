import socket as sk
from argparse import ArgumentParser

parser = ArgumentParser()
parser.add_argument("-port",type = int,default=4444,help="What is the port ? ")
args = parser.parse_args()

serverPort = args.port
bufferSize = 1024
serverSocket = sk.socket(sk.AF_INET, sk.SOCK_DGRAM)
serverSocket.bind(('', serverPort))
print('Running')
while True:
    message, clientAddress = serverSocket.recvfrom(1024)
    print ("Message received:", message)
    new_message = message.upper()
    serverSocket.sendto(new_message, clientAddress)
