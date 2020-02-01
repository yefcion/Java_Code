package rolectrl;

public enum RoleEnum implements RoleOperation{
    /**
     * SuperAdmin
     */
    ROLE_SUPER_ADMIN{
        @Override
        public String op(){
            return "ROLE_SUPER_ADMIN:"+"has AAA permission";
        }
    },

    /**
     * Admin
     */
    ROLE_ADMIN{
        @Override
        public String op(){
            return "ROLE_ADMIN:"+"has BBB permission";
        }
    },

    /**
     * Operator
     */
    ROLE_OPERA{
        @Override
        public String op(){
            return "ROLE_OPERA:"+"has CCC permission";
        }
    };
}
