

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class Rest_Auto

{
	// ---( internal utility methods )---

	final static Rest_Auto _instance = new Rest_Auto();

	static Rest_Auto _newInstance() { return new Rest_Auto(); }

	static Rest_Auto _cast(Object o) { return (Rest_Auto)o; }

	// ---( server methods )---




	public static final void JavaServiceWithInout (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(JavaServiceWithInout)>> ---
		// @sigtype java 3.5
		// [i] field:0:required In
		// [o] field:0:required Output
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	In = IDataUtil.getString( pipelineCursor, "In" );
		pipelineCursor.destroy();
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "Output", "Output" );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void JavaserviceHaveNoInout (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(JavaserviceHaveNoInout)>> ---
		// @sigtype java 3.5
		// --- <<IS-END>> ---

                
	}
}

