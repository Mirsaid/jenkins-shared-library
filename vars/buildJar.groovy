#!/usr/bin/env groovy
def call() {
	echo "building the app for branch $BRANCH_NAME"
	sh "mvn package"
}

