# splunk-integration

Steps:

Step 1 - Installed the splunk installer and the splunk universal forwarder on locally.
Step 2 - Created a Http Event Collector index.
    --------create the token,index,source--------
    settings>data inputs>HTTP Event Collector>Global Settings>Enabled
    Default Source Type - json
    Default Index - main
    Default Output Group - None
    Http Port number - 8088 -----going to use it in application
      
    #############################
    Click New Token
    Name - splunk-service-logs
    source name - http-event-logs
    click Next
    ###########################
    input settings tab
    Source type - select > log4j -----since we are going to use the log4.
    ###########################
    Index > create a new index/use existing one > review > submit
    ###########################
    Check the token created for the index under settings> data input
    ##########################
    


String INDEX_NAME = "http_index";
String TOKEN = "61862182-f7d4-4f7d-ac84-4b3ba10f9f6f";
String HOST = "localhost";
String SOURCE_NAME = "http-event-logs"
<SplunkHttp
                name="splunkhttp"
                url="http://192.168.1.9:8088"
                token=${TOKEN}
                host=${HOST}
                index=${INDEX_NAME}
                type="raw"
                source=${SOURCE_NAME}
                sourcetype="log4j"
                messageFormat="text"
                disableCertificateValidation="true">
            <PatternLayout pattern="%m" />
        </SplunkHttp>
