CREATE TABLE IF NOT EXISTS tasks (
  id IDENTITY PRIMARY KEY
  , username VARCHAR(255) NOT NULL
  , title TEXT NOT NULL
  , detail TEXT
  , deadline DATE
  , finished BOOLEAN NOT NULL DEFAULT FALSE
  , created_at DATETIME DEFAULT SYSTIMESTAMP
  , updated_at DATETIME DEFAULT SYSTIMESTAMP
  , version BIGINT DEFAULT 1
);

CREATE INDEX IF NOT EXISTS idx_tasks_username ON tasks(username);