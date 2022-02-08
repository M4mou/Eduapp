package com.machatitans.eduapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    Button settings, start, load, info;
    FileOutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            outputStream = openFileOutput("base.unv", Context.MODE_PRIVATE);
            outputStream.write(("*Accounting"+"\n"+
                    "-University Of chicago#Address: 5801 S Ellis Ave, Chicago, IL 60637, USA#Tel: +1 773-702-1234#Reading and Writing: 720–800#Math: 730–800#Scholarship: Yes#Web Site: https://www.uchicago.edu/"+"\n"+
                    "-Columbia University#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+
                    "-Northwestern University#Address: 633 Clark St, Evanston, IL 60208, USA#Tel: +1 847-491-3741#Reading and Writing: 690-760#Math: 710-800#Scholarship: Yes#Web Site: https://www.northwestern.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-Yale University#Address: New Haven, CT 06520, USA#Tel: +1 203-432-4771#Reading and Writing: 710-800#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.yale.edu/"+"\n"+

                    "*Entrepreneurship"+"\n"+
                    "-University Of chicago#Address: 5801 S Ellis Ave, Chicago, IL 60637, USA#Tel: +1 773-702-1234#SAT Reading and Writing: 720–800#SAT Math: 730–800#Scholarship: Yes#Web Site: https://www.uchicago.edu/"+"\n"+
                    "-Columbia University#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+
                    "-Northwestern University#Address: 633 Clark St, Evanston, IL 60208, USA#Tel: +1 847-491-3741#Reading and Writing: 690-760#Math: 710-800#Scholarship: Yes#Web Site: https://www.northwestern.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-Yale University#Address: New Haven, CT 06520, USA#Tel: +1 203-432-4771#Reading and Writing: 710-800#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.yale.edu/"+"\n"+

                    "*Marketing"+"\n"+
                    "-University Of chicago#Address: 5801 S Ellis Ave, Chicago, IL 60637, USA#Tel: +1 773-702-1234#SAT Reading and Writing: 720–800#SAT Math: 730–800#Scholarship: Yes#Web Site: https://www.uchicago.edu/"+"\n"+
                    "-Columbia University#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+
                    "-Northwestern University#Address: 633 Clark St, Evanston, IL 60208, USA#Tel: +1 847-491-3741#Reading and Writing: 690-760#Math: 710-800#Scholarship: Yes#Web Site: https://www.northwestern.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-Yale University#Address: New Haven, CT 06520, USA#Tel: +1 203-432-4771#Reading and Writing: 710-800#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.yale.edu/"+"\n"+

                    "*Computer Science"+"\n"+
                    "-MIT#Address: 77 Massachusetts Ave, Cambridge, MA 02139, USA#Tel: +1 617-253-1000#Reading and Writing: 700-790#Math: 760-800#Scholarship: No#Web Site: http://www.mit.edu/"+"\n"+
                    "-Stanford University#Address: 450 Serra Mall, Stanford, CA 94305, USA#Tel: +1 650-723-2300#Reading and Writing: 680-780#Math: 700-800#Scholarship: Yes#Web Site: https://www.stanford.edu/"+"\n"+
                    "-Carnegie Mellon University#Address: 5000 Forbes Avenue, Pittsburgh, PA 15213#Tel: (412) 268-2000#Reading and Writing: 730-800#Math: 700-760#Scholarship: No#Web Site: https://www.cmu.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-Princeton University#Address: Princeton, NJ 08544, USA#Tel: +1 609-258-3000#Reading and Writing 690-790#Math 710-800#Scholarship: Yes#Web Site: https://www.princeton.edu/"+"\n"+

                    "*Mechanical Engineering"+"\n"+
                    "-MIT#Address: 77 Massachusetts Ave, Cambridge, MA 02139, USA#Tel: +1 617-253-1000#Reading and Writing: 700-790#Math: 760-800#Scholarship: No#Web Site: http://www.mit.edu/"+"\n"+
                    "-Stanford University#Address: 450 Serra Mall, Stanford, CA 94305, USA#Tel: +1 650-723-2300#Reading and Writing: 680-780#Math: 700-800#Scholarship: Yes#Web Site: https://www.stanford.edu/"+"\n"+
                    "-Cambridge University#Address: 500 Rutherford Ave, Boston, MA 02129, USA#Tel: +1 617-868-1000#Reading and Writing: 730#Math: 730#Scholarship: Yes#Web Site: https://www.cambridgecollege.edu/"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+

                    "*Civil Engineering"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-Georgia Institute of Technology#Address: North Ave NW, Atlanta, GA 30332, USA#Tel: +1 404-894-2000#Reading and Writing: 640-730#Math: 680-770#Scholarship: yes#Web Site: https://www.gatech.edu/"+"\n"+
                    "-University of Illinois#Address: 1200 W Harrison St, Chicago, IL 60607, USA#Tel: +1 312-996-7000#Reading and Writing: 480-580#Math: 510-655#Scholarship: No#Web Site: https://www.uic.edu/"+"\n"+
                    "-University of Texas Austin#Address: Austin, TX 78712, USA#Tel: +1 512-471-3434#Reading and Writing: 560-680#Math: 580-730#Scholarship: Yes#Web Site: https://www.utexas.edu/"+"\n"+
                    "-Purdue University#Address: 610 Purdue Mall, West Lafayette, IN 47907, USA#Tel: +1 765-494-4600#Reading and Writing: 520-630#Math: 550-690#Scholarship: Yes#Web Site: https://www.purdue.edu/"+"\n"+

                    "*Chemical Engineering"+"\n"+
                    "-MIT#Address: 77 Massachusetts Ave, Cambridge, MA 02139, USA#Tel: +1 617-253-1000#Reading and Writing: 700-790#Math: 760-800#Scholarship: No#Web Site: http://www.mit.edu/"+"\n"+
                    "-Georgia Institute of Technology#Address: North Ave NW, Atlanta, GA 30332, USA#Tel: +1 404-894-2000#Reading and Writing: 640-730,#Math: 680-770#Scholarship: yes#Web Site: https://www.gatech.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-University of Texas Austin#Address: Austin, TX 78712, USA#Tel: +1 512-471-3434#Reading and Writing: 560-680#Math: 580-730#Scholarship: Yes#Web Site: https://www.utexas.edu/"+"\n"+
                    "-Georgia Institute of Technology#Address: North Ave NW, Atlanta, GA 30332, USA#Tel: +1 404-894-2000#Reading and Writing: 640-730,#Math: 680-770#Scholarship: yes#Web Site: https://www.gatech.edu/"+"\n"+

                    "*Electrical Engineering"+"\n"+
                    "-Stanford University#Address: 450 Serra Mall, Stanford, CA 94305, USA#Tel: +1 650-723-2300#Reading and Writing: 680-780#Math: 700-800#Scholarship: Yes#Web Site: https://www.stanford.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-California Institute of Technology#Address: 1200 E California Blvd, Pasadena, CA 91125, USA#Tel: +1 626-395-6811#Reading and Writing: 740-800#Math: 770-800#Scholarship: Yes#Web Site: https://www.caltech.edu/"+"\n"+
                    "-University of Illinois#Address: 1200 W Harrison St, Chicago, IL 60607, USA#Tel: +1 312-996-7000#Reading and Writing: 480-580#Math: 510-655#Scholarship: No#Web Site: https://www.uic.edu/"+"\n"+
                    "-Georgia Institute of Technology#Address: North Ave NW, Atlanta, GA 30332, USA#Tel: +1 404-894-2000#Reading and Writing: 640-730,#Math: 680-770#Scholarship: yes#Web Site: https://www.gatech.edu/"+"\n"+

                    "*Arts"+"\n"+
                    "-University of California, Los Angeles#Address: Los Angeles, CA 90095, USA#Tel: +1 310-825-4321#Reading and Writing: 570-710#Math: 590-760#Scholarship: merit-based scholarship#Web Site: http://www.ucla.edu/"+"\n"+
                    "-Virginia Commonwealth University#Address: 907 Floyd Ave, Richmond, VA 23284, USA#Tel: +1 804-828-0100#Reading and Writing: 490-610#Math: 490-590#Scholarship: Yes#Web Site: https://www.vcu.edu/"+"\n"+
                    "-Rhode Island School of Design#Address: 2 College St, Providence, RI 02903, USA#Tel: +1 401-454-6100#Reading and Writing: 540-670#Math: 540-670#Scholarship: Yes#Web Site: https://www.risd.edu/"+"\n"+
                    "-School of the Art Institute of Chicago#Address: 36 S Wabash Ave #1201, Chicago, IL 60603, USA#Tel: +1 800-232-7242#Reading and Writing: 530-64#Math: 490-600#Scholarship: merit-based #Web Site: http://www.saic.edu/"+"\n"+
                    "-Carnegie Mellon University#Address: 5000 Forbes Avenue, Pittsburgh, PA 15213#Tel: (412) 268-2000#Reading and Writing: 730-800#Math: 700-760#Scholarship: No#Web Site: https://www.cmu.edu/"+"\n"+

                    "*Politics"+"\n"+
                    "-Georgetown University#Address: 3700 O St NW, Washington, DC 20057, USA+1 202-687-0100#Tel: #Reading and Writing: 660-760#Math: 660-760#Scholarship: #Web Site: https://www.georgetown.edu/"+"\n"+
                    "-Columbia University#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+
                    "-Princeton University#Address: Princeton, NJ 08544, USA#Tel: +1 609-258-3000#Reading and Writing 690-790#Math 710-800#Scholarship: Yes#Web Site: https://www.princeton.edu/"+"\n"+
                    "-Washington University in St Louis#Address: 1 Brookings Dr, St. Louis, MO 63130, USA#Tel: +1 314-935-5000#Reading and Writing: 690-770#Math: 710-800#Scholarship: #Web Site: https://wustl.edu/"+"\n"+
                    "-George Washington University#Address: 2121 I St NW, Washington, DC 20052, USA#Tel: +1 314-935-5000#Reading and Writing: 580-695#Math: 600-700#Scholarship: Yes#Web Site: https://www.gwu.edu/"+"\n"+

                    "*Philosophy"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"+"\n"+
                    "-Columbia University#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+
                    "-University of Pennsylvania#Address: Philadelphia, PA 19104, USA#Tel: +1 215-898-5000#Reading and Writing: 680-770#Math: 700-800#Scholarship: Yes#Web Site: https://www.upenn.edu/"+"\n"+
                    "-Vanguard University of Southern California#Address: 55 Fair Dr, Costa Mesa, CA 92626, USA#Tel: +1 714-556-3610#Reading and Writing: 420-53#Math: 410-500#Scholarship: Yes#Web Site: https://www.vanguard.edu/"+"\n"+
                    "-Princeton University#Address: Princeton, NJ 08544, USA#Tel: +1 609-258-3000#Reading and Writing 690-790#Math 710-800#Scholarship: Yes#Web Site: https://www.princeton.edu/"+"\n"+

                    "*Anthropology"+"\n"+
                    "-Washington University in St Louis#Address: 1 Brookings Dr, St. Louis, MO 63130, USA#Tel: +1 314-935-5000#Reading and Writing: 690-770#Math: 710-800#Scholarship: #Web Site: https://wustl.edu/"+"\n"+
                    "-Columbia University, New York#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+
                    "-Yale University#Address: New Haven, CT 06520, USA#Tel: +1 203-432-4771#Reading and Writing: 710-800#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.yale.edu/"+"\n"+
                    "-University of Michigan, Ann Arbor#Address: 500 S State St, Ann Arbor, MI 48109, USA#Tel: +1 734-764-1817#Reading and Writing: 640-730#Math: 670-770#Scholarship: Yes#Web Site: https://umich.edu/"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"+"\n"+

                    "*Sports"+"\n"+
                    "-University of Florida#Address: Gainesville, FL 32611, USA#Tel: +1 352-392-3261#Reading and Writing: 580-680#Math: 600-690#Scholarship: merit-based scholarship#Web Site: http://www.ufl.edu/"+"\n"+
                    "-University of alabama#Address: Tuscaloosa, AL 35487, USA#Tel: +1 205-348-6010#Reading and Writing: 490-610#Math: 490-620#Scholarship: Yes#Web Site: https://www.ua.edu/"+"\n"+
                    "-University of North Carolina, Chapel Hill#Address: Chapel Hill, NC, USA#Tel: +1 919-962-2211#Reading and Writing: 600-7008#Math: 610-720#Scholarship: merit-based scholarships#Web Site: https://www.unc.edu/"+"\n"+
                    "-Louisiana State University#Address: Baton Rouge, LA 70803, USA#Tel: +1 225-578-3202#Reading and Writing: 500-620#Math: 510-630#Scholarship: Yes#Web Site: https://www.lsu.edu/"+"\n"+
                    "-University of Connecticut#Address: Storrs, CT 06269, USA#Tel: +1 860-486-4900#Reading and Writing: 550-650#Math: 570-690#Scholarship: merit-based scholarships#Web Site: https://uconn.edu/"+"\n"+

                    "*Medical Studies"+"\n"+
                    "-Johns Hopkins University#Address: Baltimore, MD 21218, USA#Tel: +1 410-516-8000#Reading and Writing: 690-770#Math: 710-800#Scholarship: Yes#Web Site: https://www.jhu.edu/"+"\n"+
                    "-Stanford University#Address: 450 Serra Mall, Stanford, CA 94305, USA#Tel: +1 650-723-2300#Reading and Writing: 680-780#Math: 700-800#Scholarship: Yes#Web Site: https://www.stanford.edu/"+"\n"+
                    "-University of Pennsylvania#Address: Philadelphia, PA 19104, USA#Tel: +1 215-898-5000#Reading and Writing: 680-770#Math: 700-800#Scholarship: Yes#Web Site: https://www.upenn.edu/"+"\n"+
                    "-University of California, San Francisco#Address: 505 Parnassus Ave, San Francisco, CA 94143, USA#Tel: +1 415-476-1000#Reading and Writing: 510-620#Math: 520-630#Scholarship: merit-based scholarships#Web Site: https://www.ucsf.edu/"+"\n"+
                    "-Columbia University#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+

                    "*Pharmacy"+"\n"+
                    "-University of Minnesota#Address: Minneapolis, MN 55455, USA#Tel: +1 612-625-5000#Reading and Writing: 560-700#Math: 620-750#Scholarship: Yes#Web Site: https://twin-cities.umn.edu/"+"\n"+
                    "-University of California, San Francisco#Address: 505 Parnassus Ave, San Francisco, CA 94143, USA#Tel: +1 415-476-1000#Reading and Writing: 510-620#Math: 520-630#Scholarship: merit-based scholarships#Web Site: https://www.ucsf.edu/"+"\n"+
                    "-University of Michigan, Ann Arbor#Address: 500 S State St, Ann Arbor, MI 48109, USA#Tel: +1 734-764-1817#Reading and Writing: 640-730#Math: 670-770#Scholarship: Yes#Web Site: https://umich.edu/"+"\n"+
                    "-University of Texas Austin#Address: Austin, TX 78712, USA#Tel: +1 512-471-3434#Reading and Writing: 560-680#Math: 580-730#Scholarship: Yes#Web Site: https://www.utexas.edu/"+"\n"+
                    "-Ohio State University#Address: Columbus, OH 43210, USA#Tel: +1 614-292-6446#Reading and Writing: 540-670#Math: 620-740#Scholarship: merit-based scholarship#Web Site: https://www.osu.edu/"+"\n"+

                    "*Physics"+"\n"+
                    "-Stanford University#Address: 450 Serra Mall, Stanford, CA 94305, USA#Tel: +1 650-723-2300#Reading and Writing: 680-780#Math: 700-800#Scholarship: Yes#Web Site: https://www.stanford.edu/"+"\n"+
                    "-California Institute of Technology#Address: 1200 E California Blvd, Pasadena, CA 91125, USA#Tel: +1 626-395-6811#Reading and Writing: 740-800#Math: 770-800#Scholarship: Yes#Web Site: https://www.caltech.edu/"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"+"\n"+
                    "-Princeton University#Address: Princeton, NJ 08544, USA#Tel: +1 609-258-3000#Reading and Writing 690-790#Math 710-800#Scholarship: Yes#Web Site: https://www.princeton.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+

                    "*Astronomy"+"\n"+
                    "-University of Colorado Boulder#Address: Boulder, CO 80309, USA#Tel: +1 303-492-1411#Reading and Writing: 520-640#Math: 550-670#Scholarship: merit-based scholarships#Web Site: https://www.colorado.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-University of Texas Austin#Address: Austin, TX 78712, USA#Tel: +1 512-471-3434#Reading and Writing: 560-680#Math: 580-730#Scholarship: Yes#Web Site: https://www.utexas.edu/"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"+"\n"+
                    "-University of California, Santa Cruz#Address: 1156 High St, Santa Cruz, CA 95064, USA#Tel: +1 831-459-0111#Reading and Writing: 520-630#Math: 540-660#Scholarship: Yes#Web Site: https://www.ucsc.edu/"+"\n"+

                    "*Math"+"\n"+
                    "-Princeton University#Address: Princeton, NJ 08544, USA#Tel: +1 609-258-3000#Reading and Writing 690-790#Math 710-800#Scholarship: Yes#Web Site: https://www.princeton.edu/"+"\n"+
                    "-Stanford University#Address: 450 Serra Mall, Stanford, CA 94305, USA#Tel: +1 650-723-2300#Reading and Writing: 680-780#Math: 700-800#Scholarship: Yes#Web Site: https://www.stanford.edu/"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"+"\n"+
                    "-University of California, Berkeley#Address: Berkeley, CA, USA#Tel: +1 510-642-6000#Reading and Writing: 620-750#Math: 650-790#Scholarship: Yes#Web Site: https://www.berkeley.edu/"+"\n"+
                    "-University of Oxford#Address: 500 5th Ave, New York, NY 10110, USA#Tel: +1 212-377-4900#Reading and Writing: 700#Math: 700#Scholarship: Yes#Web Site: http://www.ox.ac.uk/about/international-oxford/oxfords-global-links/north-and-central-america-caribbean/united-states-america"+"\n"+

                    "*Law"+"\n"+
                    "-Yale University#Address: New Haven, CT 06520, USA#Tel: +1 203-432-4771#Reading and Writing: 710-800#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.yale.edu/"+"\n"+
                    "-Stanford University#Address: 450 Serra Mall, Stanford, CA 94305, USA#Tel: +1 650-723-2300#Reading and Writing: 680-780#Math: 700-800#Scholarship: Yes#Web Site: https://www.stanford.edu/"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"+"\n"+
                    "-University of Illinois#Address: 1200 W Harrison St, Chicago, IL 60607, USA#Tel: +1 312-996-7000#Reading and Writing: 480-580#Math: 510-655#Scholarship: No#Web Site: https://www.uic.edu/"+"\n"+
                    "-Columbia University#Address: 116th St & Broadway, New York, NY 10027, United States#Tel: +1 212-854-1754#Reading and Writing: 700-790#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.columbia.edu/"+"\n"+

                    "*Literature"+"\n"+
                    "-University of Pennsylvania#Address: Philadelphia, PA 19104, USA#Tel: +1 215-898-5000#Reading and Writing: 680-770#Math: 700-800#Scholarship: Yes#Web Site: https://www.upenn.edu/"+"\n"+
                    "-Georgetown University#Address: 3700 O St NW, Washington, DC 20057, USA+1 202-687-0100#Tel: #Reading and Writing: 660-760#Math: 660-760#Scholarship: #Web Site: https://www.georgetown.edu/"+"\n"+
                    "-George Washington University#Address: 2121 I St NW, Washington, DC 20052, USA#Tel: +1 314-935-5000#Reading and Writing: 580-695#Math: 600-700#Scholarship: Yes#Web Site: https://www.gwu.edu/"+"\n"+
                    "-Yale University#Address: New Haven, CT 06520, USA#Tel: +1 203-432-4771#Reading and Writing: 710-800#Math: 710-800#Scholarship: merit-based scholarships#Web Site: https://www.yale.edu/"+"\n"+
                    "-Harvard University#Address: Cambridge, MA 02138, USA#Tel: +1 617-495-1000#Reading and Writing: 710-800#Math: 720-800#Scholarship: Yes#Web Site: https://www.harvard.edu/"

            ).getBytes());
            outputStream.close();
        } catch (Exception e) {
        }
        settings = (Button) findViewById(R.id.settings);
        start = (Button) findViewById(R.id.start);
        load = (Button) findViewById(R.id.load);
        info = (Button) findViewById(R.id.info);
        settings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), settings.class);
                startActivity(myIntent);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), info.class);
                startActivity(myIntent);
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), results.class);
                startActivity(myIntent);
            }
        });
    }
}
