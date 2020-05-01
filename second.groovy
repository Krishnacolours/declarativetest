pipeline{
    agent any
    stages{
        stage ('second script')
        {
            steps
            {
                echo 'I am in second script'
            }
        }
    }
}
