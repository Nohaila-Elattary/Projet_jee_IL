package gestionprojet.MVCLogin;


import gestionprojet.MVCRegister.*;
import javax.swing.JOptionPane;
import gestionprojet.menuPrincipale;


public class LoginController {
    private CompteModel utilisateurDAO;
    private LoginVue loginVue;

    public LoginController(CompteModel utilisateurDAO) {
        this.utilisateurDAO = utilisateurDAO;
    }

    public void setLoginVue(LoginVue loginVue) {
        this.loginVue = loginVue;
        this.loginVue.setController(this); // Mettre à jour la référence du contrôleur dans la vue
    }

    public void authenticateUser() {
        String email = loginVue.getEmail();
        String password = loginVue.getPassword();

        if ("".equals(email)) {
            JOptionPane.showMessageDialog(loginVue, "Email Address is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(password)) {
            JOptionPane.showMessageDialog(loginVue, "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean utilisateurValide = utilisateurDAO.verifierUtilisateur(email, password);
            if (utilisateurValide) {
                // Redirection vers la vue suivante
                 menuPrincipale HomeFrame = new menuPrincipale();
                 HomeFrame.setVisible(true);
                 HomeFrame.pack();
                 HomeFrame.setLocationRelativeTo(null); 
                 loginVue.dispose();
            } else {
                JOptionPane.showMessageDialog(loginVue, "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
            loginVue.clearPassword();
        }
    }

    public void showSignUpForm() {
       EmployeeModel employeeModel = new EmployeeModel();
        
        // Création de l'instance du contrôleur
        RegisterController controller = new RegisterController(employeeModel);
        
        // Création de la vue de connexion
        RegisterVue registerVue = new RegisterVue(controller);
        controller.setRegisterVue(registerVue);
        
        // Affichage de la vue de connexion
        registerVue.setVisible(true);
    }
}