Feature: create a public gist e2e
  Scenario: open git and login
  Given user open git url
  When user click by href '/login'
  And user input by name 'login' with value '{your username}'
  And user input by name 'password' with value '{your password}'
  Then user click button 'commit'
 
  Scenario: create public gist
  Given user open gist url
  When user input by name 'gist[description]' with value 'Creating GISTi'
  And user input by name 'gist[contents][][name]' with value 'GIST.txt'
  And user input by class 'CodeMirror-code' with value 'TEST Creating GIST'
  And Open the drop down
  And user click button by text 'Create public gist'
  Then user click button for commit 'Create public gist'
  And verify by text 'TEST Creating GIST'
  
  Scenario: edit public gist
  Given user click button by aria-label 'Edit this Gist'
  And clear text by name 'gist[description]'
  When user input by name 'gist[description]' with value 'Description edited'
  Then user click button by text 'Update public gist'
  And verify the text 'Description edited'

  Scenario: delete public gist
  Given user click button by aria-label 'Delete this Gist'
  When confirm alert
  Then verify by aria-label 'Dismiss this message'

  Scenario: see my list of gists
  Given user open gist url
  When user input by name 'gist[description]' with value 'Creating GIST'
  And user input by name 'gist[contents][][name]' with value 'GIST.txt'
  And user input by class 'CodeMirror-code' with value 'TEST Creating GIST'
  And Open the drop down
  And user click button by text 'Create public gist'
  Then user click button for commit 'Create public gist'
  And verify by text 'TEST Creating GIST'
  And user click button by text 'All gists'
  And Open the drop down profile
  And user click button by text 'Your gists'
  Then verify by text 'TEST Creating GIST'
  
  
  
  
  
  
  
  
  
  
  
  
  
