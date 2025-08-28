# Loop Tool
- The Loop tool can be used to loop over chained tools.
- Can be used as a stand alone tool or chained as an output.

## Download
Download `looper.jar` from 'releases' section of Github repository

## Build from source
`mvn clean package`

## Usage
1. Add .jar to Preferences > System Properties and restart.
2. Add tool as a standalone Test tool, or chained to another tool.
3. Chain the tool(s) to the Loop Tool, which you wish to be looped.
4. Configure the number of loops as an integer or a variable in the tool settings
5. Loop
6. Repeat Step 5.

## Resources
Adding a Custom tool:
https://docs.parasoft.com/display/SOAVIRT20252/Adding+a+Custom+Tool

Custom tool tutorial:
https://testified.github.io/soavirt-reversestringtool/