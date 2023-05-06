def getDescription(){
    def description = '''
    <h2> SCRIPT RATP_SCAN_PROJECT </h2>
    <p>--------------------------------------------------------------------------</p> 
    <h3>Stages Description : </h3>
    </p>
    <p><b>Stage Job Init :</b></p>
    <ul>
        <li>Clean workspace.</li>
        <li>Initialization of the input parameters supplied to the job via "" Launch a build with parameters ".</li>
    </ul>
    <p><b>Parameter validation :</b></p>
    <ul>
        <li>Checking the parameters, they do not contain spaces and are not empty.</li>
    </ul>
    <p><b>Checkout Project Sources :</b></p>
    <ul>
        <li>Checkout Project Sources.</li>
    </ul>
    <p><b>Scan Project</b></p>
    <ul>
        <li>Check if Project Dependencies / Project Code contains Vulnerabilities.</li>
    </ul>
    <p><b>Run Sonar Scanner Analysis :</b></p>
    <ul>
        <li>Launch Sonar Scanner Analysis.</li>
    </ul>
    '''
    return description
}
