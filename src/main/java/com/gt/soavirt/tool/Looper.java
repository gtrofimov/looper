package com.gt.soavirt.tool;

import com.parasoft.api.Application;
import com.parasoft.api.tool.*;

public class Looper implements ICustomTool {
	
	  public boolean acceptsInput(IToolInput input, ICustomToolConfiguration settings) {
		    return true;
		  }
	  
      public boolean execute(IToolInput input, IToolContext context) throws CustomToolException, InterruptedException {

    	  // The context provides access to the UI configuration and the output manager.
          ICustomToolConfiguration config = context.getConfiguration();

          // Get the number of loops
          int loops = Integer.parseInt(config.getString("count"));

          // Execute chained tools
          for (int i = 0; i < loops; i++) {
              Application.showMessage("Loop counter = " + i);
              DefaultTextInput output = new DefaultTextInput(String.valueOf(i), "UTF-8", "text/plain");
              // TODO Event signal
              context.getOutputManager().runOutput("loop_counter", output, context);
          }
          return true;
        }
      
      
		  public boolean isValidConfig(ICustomToolConfiguration settings) {
			  return true;
		  }

}
