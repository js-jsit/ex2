# ex2
 FutureStars Ex2
## Stage 2:

*docker run -p 8080:8080 -p 50000:50000 -d --name jenkins --restart unless-stopped --privileged -u root  -v /var/run/docker.sock:/var/run/docker.sock -v jenkins_home:/var/jenkins_home jenkins/jenkins*

**copy installation password to web GUI**
*docker logs jenkins*
**install jenkins with default plugins**

## Stage 3 & 4:

>GitHub GUI: Profile>Settings>Developer Settings>Personal Access Tokens>Generate new token>Note:jenkins>Select repo scope>Generate token>Copy token
>jenkins GUI: New Item>Name: ex2>Multibranch Pipeline>OK>Display Name>ex2>Add Source>GitHub>URL (clone from Github project main page)>
>\>Credentials>Add>ex2>User:user>Password{GitHub Personal Access Token}>
>\>Discover Branches>All branches>Build Configuration>Periodically>30minutes

## Stage 5:
**install docker in jenkins docker container:**
**on docker host:**

*sudo useradd -M -u 1000 jenkins
sudo usermod -L jenkins
sudo usermod -aG docker jenkins
docker exec -it -u root jenkins bash*

**on docker client:**
*usermod -aG docker jenkins
apt-get update && \
apt-get -y install apt-transport-https \
     ca-certificates \
     curl \
     gnupg2 \
     software-properties-common && \
curl -fsSL https://download.docker.com/linux/$(. /etc/os-release; echo "$ID")/gpg > /tmp/dkey; apt-key add /tmp/dkey && \
add-apt-repository \
   "deb [arch=amd64] https://download.docker.com/linux/$(. /etc/os-release; echo "$ID") \
   $(lsb_release -cs) \
   stable" && \
apt-get update && \
apt-get -y install docker-ce
exit*

**on docker host:**
*docker restart jenkins*


**after compiling and building docker image:**
*docker run -p 8081:8080 jsjsit/ex2:34*
